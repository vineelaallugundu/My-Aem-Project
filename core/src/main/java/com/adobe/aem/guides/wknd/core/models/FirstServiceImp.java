package com.adobe.aem.guides.wknd.core.models;

import com.adobe.aem.guides.wknd.core.models.FirstService;
import org.apache.sling.settings.SlingSettingsService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service= FirstService.class, immediate = true)
public class FirstServiceImp implements FirstService{

    @Reference
    private SlingSettingsService settingsService;

    @Override
    public boolean isPublishMode() {
        if(settingsService.getRunModes().contains("publish")) {
            return true;
        }
        return false;
    }
}

