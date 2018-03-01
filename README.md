docker-machine create --driver hyperv dev
docker-machine.exe env dev --shell powershell | Invoke-Expression
Get-ChildItem Env:
.\mvnw.cmd install dockerfile:build
docker image ls
docker run -p 8080:8080 908234845288
navigate to http://10.1.9.71:8080/greeting # 10.1.9.71 is the value for DOCKER_HOST