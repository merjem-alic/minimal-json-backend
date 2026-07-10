# Minimal JSON Backend

A minimal, framework-free HTTP server built with raw Java using only standard library utilities (`com.sun.net.httpserver`). Created as part of the FlyRank Backend AI Engineering Track (Week 1).

## Endpoints

*   **`GET /status`**: Returns a JSON system health check.
*   **`GET /claim`**: Returns the core portfolio specialization claim.

## How to Run Locally

1. Compile the source file:
   ```bash
   javac Main.java


## Results
```
PS C:\Users\OneDrive\Desktop\FlyRank AI\minimal-json-backend> curl http://localhost:8080/status
                                                                          
Security Warning: Script Execution Risk                                   
Invoke-WebRequest parses the content of the web page. Script code in the  
web page might be run when the page is parsed.                            
      RECOMMENDED ACTION:
      Use the -UseBasicParsing switch to avoid script code execution.

      Do you want to continue?
    
[Y] Yes  [A] Yes to All  [N] No  [L] No to All  [S] Suspend  [?] Help 
(default is "N"):y


StatusCode        : 200
StatusDescription : OK
Content           : {"status": "healthy", "track": "backend-ai"}
RawContent        : HTTP/1.1 200 OK
                    Content-Length: 44
                    Content-Type: application/json
                    Date: Fri, 10 Jul 2026 10:35:52 GMT
                    
                    {"status": "healthy", "track": "backend-ai"}
Forms             : {}                                                    
Headers           : {[Content-Length, 44], [Content-Type,                 
                    application/json], [Date, Fri, 10 Jul 2026 10:35:52   
                    GMT]}                                                 
Images            : {}
InputFields       : {}
Links             : {}
ParsedHtml        : mshtml.HTMLDocumentClass
RawContentLength  : 44
```

```
PS C:\Users\OneDrive\Desktop\FlyRank AI\minimal-json-backend> curl http://localhost:8080/claim

Security Warning: Script Execution Risk
Invoke-WebRequest parses the content of the web page. Script code in the 
web page might be run when the page is parsed.
      RECOMMENDED ACTION:
      Use the -UseBasicParsing switch to avoid script code execution.

      Do you want to continue?
    
[Y] Yes  [A] Yes to All  [N] No  [L] No to All  [S] Suspend  [?] Help 
(default is "N"):y


StatusCode        : 200
StatusDescription : OK
Content           : {"claim": "low-level concurrency and high 
                    performance backend systems"}
RawContent        : HTTP/1.1 200 OK
                    Content-Length: 71
                    Content-Type: application/json
                    Date: Fri, 10 Jul 2026 10:36:21 GMT
                    
                    {"claim": "low-level concurrency and high 
                    performance backend systems"}
Forms             : {}
Headers           : {[Content-Length, 71], [Content-Type, 
                    application/json], [Date, Fri, 10 Jul 2026 10:36:21 
                    GMT]}
Images            : {}
InputFields       : {}
Links             : {}
ParsedHtml        : mshtml.HTMLDocumentClass
RawContentLength  : 71
```