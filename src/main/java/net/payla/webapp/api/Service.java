package net.payla.webapp.api;

import net.payla.webapp.core.system.SysInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

    @RequestMapping("/v1/ver")
    public SystemInfo version(){
         SystemInfo systemInfo=new SystemInfo();
         systemInfo.setId(SysInfo.VERSION);
         systemInfo.setUpdate(SysInfo.UPDATE_STATUS);
        return systemInfo;
    }
}
