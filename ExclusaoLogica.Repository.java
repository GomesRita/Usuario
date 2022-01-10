public class usuarioRepositoty extends CrudRepository<Usuario, Long>{
  @Query("SELECT u FROM User u WHERE u.status = 1")
  Collection<Usuarios>  findAllActiveUsers();
 
  @Query("SELECT u FROM User u WHERE u.status = 0")
  Collection<Usuarios> findAllInActiveUsers();
  
}
