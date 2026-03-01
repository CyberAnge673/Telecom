Param()
Write-Host "Ejecutando formateo y comprobaciones (Spotless + Checkstyle)..."
$mvn = "mvn"
$args = "-q -DskipTests=true spotless:apply checkstyle:check"
$proc = Start-Process -FilePath $mvn -ArgumentList $args -NoNewWindow -Wait -PassThru
if ($proc.ExitCode -ne 0) {
    Write-Error "Pre-commit: las comprobaciones fallaron. Commit abortado."
    exit $proc.ExitCode
}
exit 0
