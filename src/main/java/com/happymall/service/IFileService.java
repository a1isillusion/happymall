package com.happymall.service;

import org.springframework.web.multipart.MultipartFile;
/**
 * Created by 郭江彬 on 2018/12/1 0001.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
