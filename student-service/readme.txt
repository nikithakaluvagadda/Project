kubectl create deployment studentdep --image=168p1a0225/student-service:1.0
kubectl get deployments
kubectl expose deployment studentdep --type=LoadBalancer --name=student-service --port=9090
kubectl get services
curl -v http://localhost:9090/student/1