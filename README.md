[![Build Status](https://travis-ci.org/spolnik/trading-office.svg?branch=master)](https://travis-ci.org/spolnik/trading-office)

# Trading Office is set of applications simulating simple flow in post trade part of trade lifecycle 
- it's focused on generating confirmation based on received allocation report
 
## Xap Service
- spring boot application
- it hosts gigaspaces

## Jms Service
- spring boot application
- it hosts jms (ActiveMQ)

## Allocation Message Translator
- spring boot application
- it subscribes to jms looking for new allocation report messages
- after receiving message it parses it to AllocationReport POJO
- finally, it saves the POJO into gigaspaces

## Confirmation Sender
- spring boot application
- it listens on gigaspaces notifications
- once the AllocationReport is received it generates PDF using JasperReports template
- finally, it sends the Confirmation POJO with assigned PDF (as byte[]) to confirmation service (REST Service)

## Confirmation Service
- spring boot web application (rest service)
- it exposes api to save and get saved confirmations

## Trading Domain
- library, containing all domain specific entities

## E2E Test
- end to end tests written in spock
- for now it requires that all previous applications are running on the same machine (gradle bootRun)
