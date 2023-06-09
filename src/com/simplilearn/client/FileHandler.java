package com.simplilearn.client;

import com.simplilearn.services.FileHandlingService;

public class FileHandler {
    public static void main(String[] args) {
        FileHandlingService fileManagerService = new FileHandlingService();
        fileManagerService.startHandlingFiles();
    }
}
