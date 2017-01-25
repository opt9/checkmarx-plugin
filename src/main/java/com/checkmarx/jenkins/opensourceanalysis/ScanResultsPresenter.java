package com.checkmarx.jenkins.opensourceanalysis;

import com.checkmarx.jenkins.web.model.GetOpenSourceSummaryResponse;

import java.util.logging.Logger;


/**
 * Created by tsahib on 9/13/2016.
 */
public class ScanResultsPresenter {

    private static final Logger LOGGER = Logger.getLogger(ScanResultsPresenter.class.getName());

    public ScanResultsPresenter() {
    }

    public void printResultsToOutput(GetOpenSourceSummaryResponse results) {
        StringBuilder sb = new StringBuilder();
        sb.append('\n' + "---------------------Checkmarx Scan Results(CxOSA):-------------------------").append("\n");
        sb.append("OSA High Severity Results: ").append(results.getHighCount()).append("\n");
        sb.append("OSA Medium Severity Results: ").append(results.getMediumCount()).append("\n");
        sb.append("OSA Low Severity Results: ").append(results.getLowCount()).append("\n");
        sb.append("\n");
        sb.append("Open Source Libraries: ").append(results.getTotal()).append("\n");
        sb.append("Vulnerable And Outdated: ").append(results.getVulnerableAndOutdated()).append("\n");
        sb.append("Vulnerable And Updated: ").append(results.getVulnerableAndUpdate()).append("\n");
        sb.append("Non Vulnerable Libraries: ").append(results.getNoKnownVulnerabilities()).append("\n");
        sb.append("vulnerability score: ").append(results.getVulnerabilityScore()).append("\n");
        sb.append("----------------------------------------------------------------------------").append("\n");

        LOGGER.info(sb.toString());
    }
}
