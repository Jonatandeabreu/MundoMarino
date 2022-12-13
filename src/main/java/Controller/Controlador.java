package Controller;

import Config.Conexion;
import Entidad.Persona;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.conectar());
    ModelAndView mv = new ModelAndView();
    int id;
    List datos;

    @RequestMapping("index.htm")
    public ModelAndView Listar() {
        String sql = "SELECT * FROM `empleados`";
        datos = this.jdbcTemplate.queryForList(sql);
        mv.addObject("lista", datos);
        mv.setViewName("index");
        return mv;
    }
    
    @RequestMapping("listarE.htm")
    public ModelAndView Listare() {
        String sql = "SELECT * FROM `empleados`";
        datos = this.jdbcTemplate.queryForList(sql);
        mv.addObject("lista", datos);
        mv.setViewName("listarE");
        return mv;
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar() {
        mv.addObject(new Persona());
        mv.setViewName("agregar");
        return mv;
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Persona e) {
        String sql = "insert into empleados(Nombre,Cargo,Fechain)values(?,?,?)";
        this.jdbcTemplate.update(sql, e.getNom(), e.getCargo(), e.getFechain());
        return new ModelAndView("redirect:/index.htm");
    }

    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from empleados where Id=" + id;
        datos = this.jdbcTemplate.queryForList(sql);
        mv.addObject("lista", datos);
        mv.setViewName("editar");
        return mv;
    }

    @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Persona e) {
        String sql = "update empleados set Nombre=?,Cargo=?,Fechain=? where Id="+id;
        this.jdbcTemplate.update(sql, e.getNom(), e.getCargo(), e.getFechain());
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping(value = "eliminar.htm")
    public ModelAndView Eliminar(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from empleados where Id=" + id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping("login.htm")
    public ModelAndView Login() {
        mv.setViewName("login");
        return mv;
    }
    
    @RequestMapping("logine.htm")
    public ModelAndView Logine() {
        mv.setViewName("logine");
        return mv;
    }
    
     @RequestMapping("principal.htm")
    public ModelAndView Principal() {
        mv.setViewName("principal");
        return mv;
    }
    
    @RequestMapping("especies.htm")
    public ModelAndView Especies() {
        mv.setViewName("especies");
        return mv;
    }
    
    @RequestMapping("zonas.htm")
    public ModelAndView Zonas() {
        mv.setViewName("zonas");
        return mv;
    }
    
    
    @RequestMapping(value = "login.htm", method = RequestMethod.POST)
    public ModelAndView Validar(HttpServletRequest request,Persona e) {
       String action = request.getParameter("accion");
       if(action.equals("ingresar")){
       String user = request.getParameter("txtnombre");
       String clave = request.getParameter("txtclave");
       if(user.equals("admin") && clave.equals("123")){
          mv.setViewName("redirect:/index.htm"); 
       }else{
           mv.setViewName("redirect:/login.htm");
       }
       }
       return mv;
    }
    
    @RequestMapping(value = "logine.htm", method = RequestMethod.POST)
    public ModelAndView Validare(HttpServletRequest request,Persona e) {
       String action = request.getParameter("accion");
       if(action.equals("ingresar")){
       String user = request.getParameter("txtnombre");
       String clave = request.getParameter("txtclave");
       if(user.equals("empleado") && clave.equals("321")){
          mv.setViewName("redirect:/listarE.htm"); 
       }else{
           mv.setViewName("redirect:/logine.htm");
       }
       }
       return mv;
    }
    
}
