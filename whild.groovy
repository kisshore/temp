def get = new URL("https://ptsv2.com/t/qrjtp-1655355770/post").openConnection();
get.setRequestProperty("Authorization", "Basic dXNlcjpwYXNz")
def getRC = get.getResponseCode();
println(getRC);
var=get.getInputStream().getText()
println(var)
var=var.replace("[","").replace("]","").trim()
println(var)
var = var.split(',') as List
println(var)
return var
