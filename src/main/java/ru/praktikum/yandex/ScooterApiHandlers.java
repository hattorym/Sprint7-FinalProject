package ru.praktikum.yandex;

public class ScooterApiHandlers {
    private final static String BASE_URL = "http://qa-scooter.praktikum-services.ru/";
    private final static String COURIER_POST_LOGIN = "/api/v1/courier/login";
    private final static String COURIER_POST_CREATE = "/api/v1/courier";
    private final static String COURIER_DELETE = "/api/v1/courier/:id";
    private final static String COURIER_GET_ORDERS_COUNT = "/api/v1/courier/:id/ordersCount";
    private final static String ORDER_PUT_FINISH = "/api/v1/orders/finish/:id";
    private final static String ORDER_PUT_CANCEL = "/api/v1/orders/cancel";
    private final static String ORDER_GET_LIST = "/api/v1/orders";
    private final static String ORDER_GET_BY_NUMBER = "/api/v1/orders/track";
    private final static String ORDER_PUT_ACCEPT = "/api/v1/orders/accept/:id";
    private final static String ORDER_POST_CREATE = "/api/v1/orders";
    private final static String UTILS_GET_PING = "/api/v1/ping";
    private final static String UTILS_GET_STATION = "/api/v1/stations/search";

}