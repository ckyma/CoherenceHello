From a command prompt, start a cache server instance using the DefaultCacheServer class and include the location of the coherence.jar library and the configuration files as a Java  -cp option. For example:<br> 
java -cp %COHERENCE_HOME%\lib\coherence.jar;.\config com.tangosol.net.DefaultCacheServer

Run the Hello World application and include the location of the coherence.jar library and the configuration files as a Java -cp option. For example:<br>
java -cp %COHERENCE_HOME%\lib\coherence.jar;.\config;.\ com.example.HelloWorld

To verify the cache:

From a command prompt, start a standalone connection factory instance using the CacheFactory class and include the location of the coherence.jar library and the configuration files as a Java -cp option. For example:

java -cp COHERENCE_HOME\lib\coherence.jar;COHERENCE_HOME\config com.tangosol.net.CacheFactory

The cache factory instance starts and becomes a member of the cluster and returns a command prompt for the command-line tool.

At the command-line tool command prompt, get the hello-example cache using the cache command:

cache hello-example

At the command-line tool command prompt, retrieve the contents of the cache using the list command.

list

The command returns and displays:

k1 = Hello World!