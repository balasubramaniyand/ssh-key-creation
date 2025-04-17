balasubramaniyan.d@CHNIOPEXL6947:~/cio/itime/api-time-and-attendance$ sudo docker-compose up -d
WARNING: Service "api" uses secret "db_user" which is external. External secrets are not available to containers created by docker-compose.
WARNING: Service "api" uses secret "db_password" which is external. External secrets are not available to containers created by docker-compose.
WARNING: Service "api" uses secret "db_base_url" which is external. External secrets are not available to containers created by docker-compose.
WARNING: Service "api" uses secret "db_driver_class" which is external. External secrets are not available to containers created by docker-compose.
WARNING: Service "api" uses secret "db_max_active" which is external. External secrets are not available to containers created by docker-compose.
WARNING: The Docker Engine you're using is running in swarm mode.

Compose does not use swarm mode to deploy services to multiple nodes in a swarm. All containers will be scheduled on the current node.

To deploy your application across the swarm, use `docker stack deploy`.

Starting api_container ... done
Starting ui_container  ... done
balasubramaniyan.d@CHNIOPEXL6947:~/cio/itime/api-time-and-attendance$ sudo docker-compose ps
WARNING: Service "api" uses secret "db_user" which is external. External secrets are not available to containers created by docker-compose.
WARNING: Service "api" uses secret "db_password" which is external. External secrets are not available to containers created by docker-compose.
WARNING: Service "api" uses secret "db_base_url" which is external. External secrets are not available to containers created by docker-compose.
WARNING: Service "api" uses secret "db_driver_class" which is external. External secrets are not available to containers created by docker-compose.
WARNING: Service "api" uses secret "db_max_active" which is external. External secrets are not available to containers created by docker-compose.
    Name                   Command               State                     Ports                  
--------------------------------------------------------------------------------------------------
api_container   java -jar iopex-service-0. ...   Exit 1                                           
ui_container    /opt/tomcat/bin/catalina.s ...   Up       0.0.0.0:8003->8080/tcp,:::8003->8080/tcp
balasubramaniyan.d@CHNIOPEXL6947:~/cio/itime/api-time-and-attendance$ sudo docker logs -f api_container   java -jar iopex-service-0. ...   Exit 1
unknown shorthand flag: 'j' in -jar
See 'docker logs --help'.
balasubramaniyan.d@CHNIOPEXL6947:~/cio/itime/api-time-and-attendance$ sudo docker logs -f api_container   

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.5)

2025-04-17 11:03:01,641 INFO org.springframework.boot.StartupInfoLogger [main] || Starting IopexServiceApplication v0.0.1-SNAPSHOT using Java 11.0.16 on 048972b17be3 with PID 1 (/app/iopex-service/target/iopex-service-0.0.1-SNAPSHOT.jar started by root in /app/iopex-service/target)
2025-04-17 11:03:01,644 INFO org.springframework.boot.SpringApplication [main] || No active profile set, falling back to 1 default profile: "default"
2025-04-17 11:03:02,223 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-04-17 11:03:02,452 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Finished Spring Data repository scanning in 222 ms. Found 61 JPA repository interfaces.
2025-04-17 11:03:02,452 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-04-17 11:03:02,473 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Finished Spring Data repository scanning in 20 ms. Found 6 JPA repository interfaces.
2025-04-17 11:03:02,473 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-04-17 11:03:02,483 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Finished Spring Data repository scanning in 9 ms. Found 1 JPA repository interfaces.
2025-04-17 11:03:03,295 INFO org.springframework.boot.web.embedded.tomcat.TomcatWebServer [main] || Tomcat initialized with port(s): 8080 (http)
2025-04-17 11:03:03,302 INFO org.apache.juli.logging.DirectJDKLog [main] || Initializing ProtocolHandler ["http-nio-8080"]
2025-04-17 11:03:03,303 INFO org.apache.juli.logging.DirectJDKLog [main] || Starting service [Tomcat]
2025-04-17 11:03:03,303 INFO org.apache.juli.logging.DirectJDKLog [main] || Starting Servlet engine: [Apache Tomcat/9.0.68]
2025-04-17 11:03:03,382 INFO org.apache.juli.logging.DirectJDKLog [main] || Initializing Spring embedded WebApplicationContext
2025-04-17 11:03:03,382 INFO org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext [main] || Root WebApplicationContext: initialization completed in 1677 ms
2025-04-17 11:03:03,561 INFO org.hibernate.jpa.internal.util.LogHelper [main] || HHH000204: Processing PersistenceUnitInfo [name: default]
2025-04-17 11:03:03,598 INFO org.hibernate.Version [main] || HHH000412: Hibernate ORM core version 5.6.12.Final
2025-04-17 11:03:03,701 INFO org.hibernate.annotations.common.reflection.java.JavaReflectionManager [main] || HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2025-04-17 11:03:03,959 ERROR com.zaxxer.hikari.HikariConfig [main] || HikariPool-1 - dataSource or dataSourceClassName or jdbcUrl is required.
2025-04-17 11:03:03,961 WARN org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator [main] || HHH000342: Could not obtain connection to query metadata
java.lang.IllegalArgumentException: dataSource or dataSourceClassName or jdbcUrl is required.
	at com.zaxxer.hikari.HikariConfig.validate(HikariConfig.java:1029)
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:109)
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:181)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:175)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:173)
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:127)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1460)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1494)
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:58)
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365)
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409)
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396)
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1863)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1154)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:908)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:308)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295)
	at com.iopex.IopexServiceApplication.main(IopexServiceApplication.java:26)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
2025-04-17 11:03:03,962 ERROR org.springframework.orm.jpa.AbstractEntityManagerFactoryBean [main] || Failed to initialize JPA EntityManagerFactory: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
2025-04-17 11:03:03,962 WARN org.springframework.context.support.AbstractApplicationContext [main] || Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'primaryEntityManagerFactory' defined in class path resource [com/iopex/persistence/dbconfiguration/PrimaryDBConfig.class]: Invocation of init method failed; nested exception is org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
2025-04-17 11:03:03,964 INFO org.apache.juli.logging.DirectJDKLog [main] || Stopping service [Tomcat]
2025-04-17 11:03:03,976 INFO org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener [main] || 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2025-04-17 11:03:03,986 ERROR org.springframework.boot.SpringApplication [main] || Application run failed
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'primaryEntityManagerFactory' defined in class path resource [com/iopex/persistence/dbconfiguration/PrimaryDBConfig.class]: Invocation of init method failed; nested exception is org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1804)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1154)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:908)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:308)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295)
	at com.iopex.IopexServiceApplication.main(IopexServiceApplication.java:26)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:275)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:175)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:173)
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:127)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1460)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1494)
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:58)
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365)
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409)
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396)
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1863)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
	... 24 common frames omitted
Caused by: org.hibernate.HibernateException: Access to DialectResolutionInfo cannot be null when 'hibernate.dialect' not set
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:100)
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:54)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:138)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263)
	... 41 common frames omitted

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.5)

2025-04-17 11:19:36,519 INFO org.springframework.boot.StartupInfoLogger [main] || Starting IopexServiceApplication v0.0.1-SNAPSHOT using Java 11.0.16 on 048972b17be3 with PID 1 (/app/iopex-service/target/iopex-service-0.0.1-SNAPSHOT.jar started by root in /app/iopex-service/target)
2025-04-17 11:19:36,523 INFO org.springframework.boot.SpringApplication [main] || No active profile set, falling back to 1 default profile: "default"
2025-04-17 11:19:37,077 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-04-17 11:19:37,270 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Finished Spring Data repository scanning in 186 ms. Found 61 JPA repository interfaces.
2025-04-17 11:19:37,270 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-04-17 11:19:37,290 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Finished Spring Data repository scanning in 19 ms. Found 6 JPA repository interfaces.
2025-04-17 11:19:37,291 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-04-17 11:19:37,299 INFO org.springframework.data.repository.config.RepositoryConfigurationDelegate [main] || Finished Spring Data repository scanning in 8 ms. Found 1 JPA repository interfaces.
2025-04-17 11:19:37,872 INFO org.springframework.boot.web.embedded.tomcat.TomcatWebServer [main] || Tomcat initialized with port(s): 8080 (http)
2025-04-17 11:19:37,879 INFO org.apache.juli.logging.DirectJDKLog [main] || Initializing ProtocolHandler ["http-nio-8080"]
2025-04-17 11:19:37,879 INFO org.apache.juli.logging.DirectJDKLog [main] || Starting service [Tomcat]
2025-04-17 11:19:37,879 INFO org.apache.juli.logging.DirectJDKLog [main] || Starting Servlet engine: [Apache Tomcat/9.0.68]
2025-04-17 11:19:37,943 INFO org.apache.juli.logging.DirectJDKLog [main] || Initializing Spring embedded WebApplicationContext
2025-04-17 11:19:37,943 INFO org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext [main] || Root WebApplicationContext: initialization completed in 1364 ms
2025-04-17 11:19:38,110 INFO org.hibernate.jpa.internal.util.LogHelper [main] || HHH000204: Processing PersistenceUnitInfo [name: default]
2025-04-17 11:19:38,162 INFO org.hibernate.Version [main] || HHH000412: Hibernate ORM core version 5.6.12.Final
2025-04-17 11:19:38,261 INFO org.hibernate.annotations.common.reflection.java.JavaReflectionManager [main] || HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2025-04-17 11:19:38,493 ERROR com.zaxxer.hikari.HikariConfig [main] || HikariPool-1 - dataSource or dataSourceClassName or jdbcUrl is required.
2025-04-17 11:19:38,494 WARN org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator [main] || HHH000342: Could not obtain connection to query metadata
java.lang.IllegalArgumentException: dataSource or dataSourceClassName or jdbcUrl is required.
	at com.zaxxer.hikari.HikariConfig.validate(HikariConfig.java:1029)
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:109)
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:181)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:175)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:173)
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:127)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1460)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1494)
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:58)
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365)
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409)
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396)
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1863)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1154)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:908)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:308)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295)
	at com.iopex.IopexServiceApplication.main(IopexServiceApplication.java:26)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
2025-04-17 11:19:38,496 ERROR org.springframework.orm.jpa.AbstractEntityManagerFactoryBean [main] || Failed to initialize JPA EntityManagerFactory: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
2025-04-17 11:19:38,496 WARN org.springframework.context.support.AbstractApplicationContext [main] || Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'primaryEntityManagerFactory' defined in class path resource [com/iopex/persistence/dbconfiguration/PrimaryDBConfig.class]: Invocation of init method failed; nested exception is org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
2025-04-17 11:19:38,498 INFO org.apache.juli.logging.DirectJDKLog [main] || Stopping service [Tomcat]
2025-04-17 11:19:38,512 INFO org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener [main] || 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2025-04-17 11:19:38,522 ERROR org.springframework.boot.SpringApplication [main] || Application run failed
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'primaryEntityManagerFactory' defined in class path resource [com/iopex/persistence/dbconfiguration/PrimaryDBConfig.class]: Invocation of init method failed; nested exception is org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1804)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1154)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:908)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:308)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295)
	at com.iopex.IopexServiceApplication.main(IopexServiceApplication.java:26)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:275)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:175)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:173)
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:127)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1460)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1494)
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:58)
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365)
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409)
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396)
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1863)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800)
	... 24 common frames omitted
Caused by: org.hibernate.HibernateException: Access to DialectResolutionInfo cannot be null when 'hibernate.dialect' not set
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:100)
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:54)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:138)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263)
	... 41 common frames omitted
balasubramaniyan.d@CHNIOPEXL6947:~/cio/itime/api-time-and-attendance$ 

