package net.payla.webapp.api.core;

import net.payla.webapp.system.SystemDefine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

    @RequestMapping("/v1/ver")
    public SystemInfo version(){
         SystemInfo systemInfo=new SystemInfo();
         systemInfo.setId(SystemDefine.VERSION);
         systemInfo.setUpdate(SystemDefine.UPDATE_STATUS);
        return systemInfo;
    }
}
