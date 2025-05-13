# Aws-CodeBuild
1.CodeBuild compiles our  source code, runs unit tests, and produces artifacts .
2.CodeBuild eliminates the need to provision, manage, and scale your own build servers. 
3.It provides prepackaged build environments for popular programming languages and build tools such as Apache Maven, Gradle.



Steps :- 

1. Go to aws CodeBuild console and create new project i.e The name you want for your CodeBuild project.
2. Select Source for your code , here it can be BitBucket, GutHub , S3 , CodeCommit anything , i Have used S3 as a source for my code , providing the bucket name and uploading  Zip in that Bucket .
3. Here our code should contain buildspec.yml for Build flows .
4. In Artifacts the path of bucket should be mentioned where we need to get the jar or war .
