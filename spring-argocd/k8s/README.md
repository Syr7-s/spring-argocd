kubectl logs -f pod/pod_name -n spring-argocd
kubectl port-forward pod/pod_name 8100: -n spring-argocd
curl -X POST "http://localhost:8100/api/v1/create/message" -H  "accept: */*" -H  "Content-Type: application/json" -d "{\"message\":\"Hello World\"}"

