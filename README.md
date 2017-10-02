# Assignment 1: A (Java) software engineers toolbox


## Get familiar with Git

1. Familiarize yourself with [git](https://git-scm.com) by completing this [interactive tutorial](https://try.github.io) in your browser.
2. Install git on your machine.
	- Mac: Open `Terminal.app` and install the Apple Developer Tools by executing `xcode-select --install`.
	- Linux: Use your distribution's package manager to install git; on Ubuntu, you'll run something like 
		```bash
		$ sudo apt-get update
		$ sudo apt-get install git
		```
	- Windows: ~~You should not use Windows, use Ubuntu on VirtualBox instead.~~ Download and install the [Windows installation package](https://git-scm.com/download/win); make sure to install (and use) git bash.
3. Try git in the real world:
	- Sign in or create an account on [Github](https://github.com) (it's free, and if you don't have one yet, you're already left behind).
	- Create a new repository (note: with a free account, your're limited to public repos); select __Initialize this repository with a README__ to add a `README.md` file.
	- On your computer, clone your new repository, edit the `README.md` to your choice, using the [Github markdown cheatsheet](https://guides.github.com/features/mastering-markdown/).
	- Add/stage and commit the changes, and push them to your repository.
	- Create and switch to a new branch (eg. `feature/add-licence`), and add a file `LICENSE` to it, containing the MIT open source software license. Not sure where to find it? Try [this link](http://bfy.tw/EF8t). For a real project, you may want to chose a different license (read more about licenses here: [https://opensource.org/licenses](https://opensource.org/licenses)).
	- Push the branch; you should now be able to see it on Github.
	- On Github, create a pull request and merge it to master.
	- Back on your computer, checkout `master`, and pull the changes to update your local copy.


> You should now know what it means if someone asks you: Can you please merge my PR into your master branch?

## Get familiar with Gradle

0. Install the [Gradle build tool](https://gradle.org/); make sure you have a recent [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) installed and configured for command line use.
1. Familiarize yourself by completing the [Java application tutorial](https://guides.gradle.org/building-java-applications/). Note: This requires a command line shell, such as bash. If you're running Windows, you can use git's bash, try Cygwin, or use Ubuntu on VirtualBox.


> Note: Using the gradle wrapper is generally advised.

> You should now know how to read a basic `build.gradle` file, and what `gradle build` means.


## Get familiar with IntelliJ

Blub.