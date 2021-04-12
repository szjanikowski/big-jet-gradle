#!/bin/zsh
git checkout master
git fetch origin master

for i in commands examples value-objects aggregate cqrs-and-process
do
  echo "Updating branch $i"
  git checkout $i
  git rebase FETCH_HEAD
  git push origin $i --force-with-lease
done
git checkout master