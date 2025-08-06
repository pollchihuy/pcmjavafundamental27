package com.juaracoding.pcmjavafundamental.oop.genericz.core;

/** kontrak buat functional CRUD */
public interface IService<T> {

    public void save(T t);//001-010
    public void update(Long id,T t);//011-020
    public void delete(Long id);//021-030
    public void findAll();//031-040
    public void findById(Long id);//041-050
    public void findByParam(String columnName,String value);//051-060
//    public void findByParam(String columnName,String value,String param3);//061-070

}
