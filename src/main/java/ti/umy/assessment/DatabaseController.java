/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.assessment;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DatabaseController {
    
    @RequestMapping("/mahasiswa")
    @ResponseBody
    public List<Datamahasiswa> getMahasiswa(){
        
        List<Datamahasiswa> mahasiswa = new ArrayList<>();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try {
            mahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return mahasiswa;
    }
    //-----------------------------------------------
    @RequestMapping(value = "/mahasiswa/xml", 
           produces = {
            MediaType.APPLICATION_XML_VALUE
           })
    @ResponseBody
    public List<Datamahasiswa> getMahasiswaXML(){
        List<Datamahasiswa> mahasiswa = new ArrayList<>();
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try {
            mahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return mahasiswa;        
    }
    //------------------------------------------------
    @RequestMapping(value = "/mahasiswa/json", 
           produces = {
            MediaType.APPLICATION_JSON_VALUE
           })
    @ResponseBody
    public List<Datamahasiswa> getMahasiswaJSON(){
        List<Datamahasiswa> mahasiswa = new ArrayList<>();
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try {
            mahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return mahasiswa;
    }
    
}
