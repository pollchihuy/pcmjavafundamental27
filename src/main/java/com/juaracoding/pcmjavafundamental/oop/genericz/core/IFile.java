package com.juaracoding.pcmjavafundamental.oop.genericz.core;

/** File Handling */
public interface IFile<T> {
    public void read(T t);//100-110
    public void write(T t);//111-120
    public void upload();
    public void downloadPDF();
    public void downloadExcel();
}