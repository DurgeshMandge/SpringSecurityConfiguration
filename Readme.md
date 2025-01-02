#steps
1. set username and password
2. by default csrf is enabled (on post/put/delete)
3. configure security (@EnableSecurityConfig, @Configuration)
4. remove csrf by adding
5. make it stateless
6. change `authentication provider all to use database`
   1. use `DaoAuthenticationProvider class`
7. get user from database


* add dependency 
  *            \
    *             -> consequences-> restrictions => step1) put/post/delete [csrf wrapper]
  * Anything related to security => will go int @EnableWebSecurity
    *                                           => step2) remoce auth from [login, register]
      *                                         =>


configure security
               Basic CRUD api
                     |
               Roles -> (USER & ADMIN)
                     |
               AuthenticationManage  -> (Configure JWT )
                     |
               AuthenticationProvider -> (get user from db)
                     |
               UserDetailService  -> (hardcoded new users and passwords)
                     |
               Only Default Spring Security -> (1 user login by default [user, "pass in logs"])