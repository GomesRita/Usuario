public class usuarioRepositoty extends CrudRepository<Usuario, Long>{
  //Consulta usuarios ativos
  @Query("SELECT u FROM User u WHERE u.status = 1")
  Collection<Usuarios> findAllActiveUsers();
  //Consulta usuarios inativos
  @Query("SELECT u FROM User u WHERE u.status = 0")
  Collection<Usuarios> findAllInActiveUsers();
  
}
