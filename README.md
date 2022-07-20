# A Unit Converter Application in Angular and Spring Boot

## Run the application
To run the application, please run the following commands:
```
$ ./mvnw spring-boot:run
```
The default port is 5000 at the moment in application.yml file.

## Pushing to Github and CI/CD Pipeline
1. When a branch is to be merged to the master branch it requires a peer approval
2. When a branch is merged to the master branch the CI/CD Pipeline Runs
3. Pipeline Steps:
  1. Run the unit test cases
  2. Build the application
  3. Upload artifact
  4. Download artifact
  5. Deploy to AWS
4. Current Deployment: <http://unitconverter-env.eba-nmq97z2t.us-east-1.elasticbeanstalk.com/>

## Guide to the User Interface
1. You should choose between Volume and Temperature
2. Validation Triggers when these conditions are not met:
  1. The input numerical value should not be empty and should be numeric
  2. The input unit of measure should be chosen
  3. The target unit of measure should be chosen
  4. The student response should not be empty and should be numeric
3. Convert Button is disabled until all the validation are validated and correct.
4. Reset Button will set the all the parameters or reset the form.

## User Interface Images

## Validations
![Validation](/images/validation.png?raw=true "Validation")


## Incorrect Result
![Incorrect Result](/images/incorrectResult.png?raw=true "Incorrect Result")


## Correct Result
![Correct Result](/images/correctResult.png?raw=true "Correct Result")

## CI/CD Pipeline
![CI/CD Pipeline](/images/cicdPipeline.png?raw=true "CI/CD Pipeline")

## Code Coverage

### Jacoco is used for code coverage for Java Code or Spring Boot, can be found in Jacoco Folder
   ![Code Coverage Java](/images/codeCoverageJava.png?raw=true "Code Coverage Java")

###Angular has code coverage and can be found in coverage folder
   ![Code Coverage Angular](/images/codeCoverageAngular.png?raw=true "Code Coverage Angular")

## Overall Application
1. The UI is in Angular
2. When one clicks on the convert button, an API is fired with POST Request
3. The API Response is the correct output for the conversion
4. The API Response is compared with the student response and evaluated whether it is Correct or Incorrect
