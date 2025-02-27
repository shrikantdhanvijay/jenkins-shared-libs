def call(String url,String branch){
    git url: "${url}", branch: "${branch}"
}

def trivy_fs(){
  sh "trivy fs . -o results.json"
}