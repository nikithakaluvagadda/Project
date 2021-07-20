kubectl create deployment hoteldep --image=168p1a0225/hotel-service:1.0
kubectl get deployments
kubectl expose deployment hoteldep --type=LoadBalancer --name=hotel-service --port=6565
kubectl get services
curl -v http://localhost:6565/hotels