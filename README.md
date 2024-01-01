## Event Driven Architecture App
This project serves as a demonstration of Event-Driven Architecture (EDA) principles and practices. It's structured as a microservices-based application showcasing the interaction between different modules through event-driven communication.


#### Modules Overview
##### Core
The Core module acts as a centralized repository for shared classes and essential information across the application. It facilitates seamless communication and consistent data handling among various components.

##### Api
The Api module, built on the Spring Web framework, serves as the entry point for collecting events originating both internally and externally. This module efficiently captures and forwards events to downstream consumers.

##### Log
The Log module functions as a consumer service responsible for logging events to a database. It demonstrates the processing and persistence of received events, showcasing how information flows through the system.

##### Automation
The Automation module represents another consumer microservice within the ecosystem. It specializes in evaluating predefined scenarios based on the received events. This module demonstrates the implementation of automated responses or actions triggered by specific event patterns.

#### Note on Implementation:

Please note that the service class implementations within each module have been deliberately left incomplete to maintain simplicity. You are encouraged to explore and enhance these implementations to further understand and expand the capabilities of an event-driven architecture.

#### Suggestions and Improvements:
We welcome any suggestions or improvements that can enhance the codebase, improve documentation, or refine the overall architecture. Please don't hesitate to reach out, share your ideas, or report issues.