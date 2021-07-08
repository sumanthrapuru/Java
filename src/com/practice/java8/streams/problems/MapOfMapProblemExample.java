package com.practice.java8.streams.problems;

import java.util.*;
import java.util.stream.Collectors;

public class MapOfMapProblemExample {
    static Map<String, Map<String, Set<String>>> getProjectIdToSiteIdToDeviceIdMap(Set<String> projectIds) {
        List<ProjectBasicDTO> projectBasicDTOs = projectIds.stream().map(ProjectBasicDTO::new).collect(Collectors.toList());
        return projectBasicDTOs.stream()
                .collect(Collectors.toMap(ProjectBasicDTO::getProjectId,
                        projectBasicDTO ->
                            projectBasicDTO.getSiteBasicDTOs()
                                    .stream()
                                    .collect(Collectors.toMap(SiteBasicDTO::getSiteId,
                                            siteBasicDTO -> siteBasicDTO.getSiteBasicDTOs()
                                                    .stream()
                                                    .map(DeviceBasicDTO::getDeviceId)
                                                    .collect(Collectors.toSet())

                                    ))

                ));
    }

    public static void main(String[] args) {
        System.out.println(getProjectIdToSiteIdToDeviceIdMap(new HashSet<String>(Arrays.asList("Proj1"))));
    }
}

class ProjectBasicDTO {
    private String projectId;
    private List<SiteBasicDTO> siteBasicDTOs = Arrays.asList(new SiteBasicDTO("Site1"));

    public ProjectBasicDTO(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<SiteBasicDTO> getSiteBasicDTOs() {
        return siteBasicDTOs;
    }

    public void setSiteBasicDTOs(List<SiteBasicDTO> siteBasicDTOs) {
        this.siteBasicDTOs = siteBasicDTOs;
    }
}

class SiteBasicDTO {
    private String siteId;

    private List<DeviceBasicDTO> siteBasicDTOs = Arrays.asList(new DeviceBasicDTO("Dev1"));

    public SiteBasicDTO(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public List<DeviceBasicDTO> getSiteBasicDTOs() {
        return siteBasicDTOs;
    }

    public void setSiteBasicDTOs(List<DeviceBasicDTO> siteBasicDTOs) {
        this.siteBasicDTOs = siteBasicDTOs;
    }
}

class DeviceBasicDTO {
    private String deviceId;


    public DeviceBasicDTO(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}