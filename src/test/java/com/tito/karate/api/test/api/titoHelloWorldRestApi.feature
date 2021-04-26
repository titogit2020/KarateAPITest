Feature: Tito Hello World Rest Api
 
    Background:
        * url 'http://localhost:8081'
    
    Scenario: Tito Hello World Rest Api
    
        Given path 'hello-world'
        When method GET
        Then status 200
        #And match $ == {quote:'#notnull'} 