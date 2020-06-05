SHELL := /bin/bash

wrapper:
	gradle wrapper

dependencies:
	./gradlew dependencies

clean:
	./gradlew clean

compile: clean
	./gradlew --refresh-dependencies scmVersion build

pushTag:
	./gradlew scmVersionPush