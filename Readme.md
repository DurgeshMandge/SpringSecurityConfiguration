#steps
1. set username and password
2. by default csrf is enabled (on post/put/delete)
3. configure security (@EnableSecurityConfig, @Configuration)
4. remove csrf by adding
5. make it stateless
6. change `authentication provider all to use database`
   1. use `DaoAuthenticationProvider class`
7. get user from database
