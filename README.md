# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

This repository is for automation of some test cases for Spotify application (1.0.51.693.g6ea1e7f6) using Sikuli Java API.

### set up? ###

   The set up was done using Eclipse on Mac
   
### Dependencies###
  All the dependencies are managed by Maven and is configured in pom.xml

### Tests and How to run tests ###
  There are 6 tests all together

* testLogin() - tests a valid login  - Requirement 1
* testFailedLogin()- tests an invalid login - Requirement 2
* searchScenario[0] - tests first search scenario  - Requirement 3
* searchScenario[1] - tests second search scenario - Requirement 3
* TestPlaySong() - tests that songs can be played  - Requirement 4
* TestPlayList() - tests that at least one song can be added to a playlist - Requirement 5

  Clone this repository to eclipse. Once project is visible in eclipse package explorer, right click on the project and Run As --> Junit Test


### Assumptions ###

* Spotify.app should be placed in /Applications/ on mac
* Internet connection should be reliable enough to provide results quickly.
* Moving  mouse after test starts may cause test failures.
* Tests was developed on default opening of Spotify application on a 13-inc mac book air

### Data ###

Data was managed using @DataProvider plugin for Junit. It was used for searchScenarios() method but it can extended to use on other methods also. Data can also be managed by reading from  external source such as excel and text files.