Param()
if (-not (Test-Path -Path ".git")) {
    Write-Error "Este script debe ejecutarse desde la raíz del repositorio (donde está .git)."
    exit 1
}
git config core.hooksPath .githooks
Write-Host "core.hooksPath configurado a .githooks"
Write-Host "Si usas Git GUI o IDE, reinicia o verifica la configuración de Git si no aplica inmediatamente."
