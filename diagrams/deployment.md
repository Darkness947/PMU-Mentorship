# 🖥️ UML Deployment Diagram

This UML Deployment Diagram maps the physical execution nodes (User Devices, Application Servers, Database Instances, Cloud Buckets) and the networking protocols (HTTPS, TCP/IP SQL, AWS SDK) used to host and scale the PMU-Mentorship application.

```mermaid
flowchart TD
    subgraph ClientNode ["Client Node (User Device)"]
        Browser["Web Browser<br/>(Chrome / Safari / Firefox)"]
        RuntimeJS["Client Javascript Engine"]
        Browser --- RuntimeJS
    end

    subgraph AppServerNode ["Application Server Node (AWS EC2 / Virtual Server)"]
        OS_Linux["Linux OS (Ubuntu)"]
        subgraph NodeEnv ["Node.js Execution Environment"]
            PM2["PM2 Process Manager"]
            ExpressApp["Express.js Server Engine"]
            JavaBridge["Java Helpers (Domain Object Validations)"]
            PM2 --- ExpressApp
            ExpressApp --- JavaBridge
        end
        OS_Linux --- NodeEnv
    end

    subgraph DBServerNode ["Database Server Node (AWS RDS / MySQL Instance)"]
        OS_DB["DB Server OS"]
        subgraph MySQLInstance ["MySQL DBMS"]
            AppDB[("pmu_mentorship Schema")]
        end
        OS_DB --- MySQLInstance
    end

    subgraph S3Node ["Cloud Storage Node (AWS S3 Bucket)"]
        Bucket[("pmu-mentorship-resources")]
    end

    %% Network Connections
    Browser ====|"HTTPS (Port 443)<br/>TLS / REST API"| ExpressApp
    ExpressApp ====|"TCP/IP SQL (Port 3306)"| AppDB
    ExpressApp ====|"AWS SDK / HTTPS (Port 443)"| Bucket

    %% Styling
    classDef hardware fill:#eceff1,stroke:#37474f,stroke-width:2px,stroke-dasharray: 5 5;
    classDef software fill:#ffffff,stroke:#00acc1,stroke-width:2px;
    classDef database fill:#efebe9,stroke:#4e342e,stroke-width:2px;

    class ClientNode,AppServerNode,DBServerNode,S3Node hardware;
    class Browser,RuntimeJS,OS_Linux,PM2,ExpressApp,JavaBridge,OS_DB,MySQLInstance software;
    class AppDB,Bucket database;
```

---
### Physical Infrastructure Breakdown

1. **Client Node (User Desktop or Mobile)**:
   - Contains standard modern browsers interpreting frontend React assets, running inside a secure sandbox client-side.
2. **Application Server Node (AWS EC2 / VPS)**:
   - Hosts a Linux OS running Node.js. PM2 manages process uptime. Express.js acts as the server runtime engine, integrating Java helper scripts (e.g. backend validation objects).
3. **Database Server Node (AWS RDS / Managed MySQL)**:
   - A dedicated server instance running a hardened Database Management System (DBMS) to optimize query read/write loads securely.
4. **Cloud Storage Node (AWS S3)**:
   - Handles scalable, static binary objects (like PDF slides or document templates uploaded by Mentors) separately, reducing core disk-space overhead on the app server.
