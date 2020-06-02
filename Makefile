SHELL := /bin/bash

wrapper:
	gradle wrapper

dependencies:
	./gradlew dependencies

clean:
	./gradlew clean

compile: clean
	./gradlew scmVersion build

pushTag:
	./gradlew scmVersionPush