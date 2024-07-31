#!/bin/bash

javac -d ./bin/ ./src/module-info.java
javac -d ./bin/ ./src/entidades/extras/*
javac -d ./bin/ ./src/entidades/distribuicoes/abstracts/*
javac -d ./bin/ ./src/entidades/distribuicoes/concretes/*
javac -d ./bin/ ./src/entidades/estatisticas/*
javac -d ./bin/ ./src/application/main.java