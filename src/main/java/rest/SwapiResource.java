///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package rest;
//
//import facades.apiFacade;
//import java.util.ArrayList;
//import java.util.List;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.UriInfo;
//import javax.ws.rs.Produces;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.core.MediaType;
//
///**
// *
// * @author jojus1101
// */
//@Path("starwars")
//public class SwapiResource {
//
//    @Context
//    private UriInfo context;
//
//    @GET
//    @Path("peoplelist")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getJsonPeopleList() {
//        apiFacade af = new apiFacade();
//        String url = "https://swapi.co/api/people/";
//        List<String> list = new ArrayList();
//        list.add("1/");
//        list.add("2/");
//        list.add("3/");
//        list.add("4/");
//        list.add("5/");
//        return af.getSwappiData(list).toString();
//    }
//
//    @GET
//    @Path("planetlist")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getJsonPlanetList() {
//        apiFacade af = new apiFacade();
//        String url = "https://swapi.co/api/planets/";
//        List<String> list = new ArrayList();
//        list.add("1/");
//        list.add("2/");
//        list.add("3/");
//        list.add("4/");
//        list.add("5/");
//        return af.getSwappiData(url, list).toString();
//    }
//}
