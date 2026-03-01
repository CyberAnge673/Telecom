Param()
Write-Host "Ejecutando formateo (intento) y comprobaciones (formatter + Checkstyle)..."

# Intentar formatter:format, pero no abortar si falla
try {
    Start-Process -FilePath "mvn" -ArgumentList "-q -DskipTests=true formatter:format" -NoNewWindow -Wait -PassThru | Out-Null
} catch {
    Write-Warning "formatter:format falló, continuando con checkstyle."
}

# Ejecutar checkstyle y abortar si falla
$proc = Start-Process -FilePath "mvn" -ArgumentList "-q -DskipTests=true checkstyle:check" -NoNewWindow -Wait -PassThru
if ($proc.ExitCode -ne 0) {
    Write-Error "Pre-commit: Checkstyle falló. Commit abortado."
    exit $proc.ExitCode
}
exit 0
