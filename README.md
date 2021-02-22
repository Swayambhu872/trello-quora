# trello-quora

This is a Q&A type application where users can post questions or answer to questions. 
Users have to be authenticated in order to user any of the features.
Roles:
  1. admin
  2. nonadmin

### Setup
1. Set your local postgreSQL password in ```application.yaml``` and ```localhost.properties```.
2. Build the project in the main directory of the project using ```mvn clean install -DskipTests```.
3. In order to activate the profile setup, move to quora-db folder using "cd quora-db" command in the terminal and then run ```mvn clean install -Psetup``` command to activate the profile setup.

### Endpoints

#### User Controller
1. signup - "/user/signup"
2. signin - "/user/signin"
3. signout - "/user/signout"

#### Common Controller
1. userProfile - "/userprofile/{userId}"

#### Admin Controller
1. userDelete - "/admin/user/{userId}"

#### Question Controller
1. createQuestion - "/question/create"
2. getAllQuestions - "/question/all"
3. editQuestionContent - "/question/edit/{questionId}"
4. deleteQuestion - "/question/delete/{questionId}"
5. getAllQuestionsByUser - "question/all/{userId}"

#### Answer Controller
1. createAnswer - "/question/{questionId}/answer/create"
2. editAnswerContent - "/answer/edit/{answerId}"
3. deleteAnswer - "/answer/delete/{answerId}"
4. getAllAnswersToQuestion - "answer/all/{questionId}"
