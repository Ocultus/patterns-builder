fun main() {
    val worldWideShipment = Shipment.Builder().weight(2).senderCountry("Germany")
            .senderAddress("Ingenried, Ufnau Strasse 94")
            .recipientCountry("Russia")
            .recipientAddress("Омск, ул. Ленина 100")
            .shipmentType(ShipmentType.SMALL_PACKET)
            .build()

    val internalShipment = Shipment.Builder().senderAddress("г.Курган, ул. Дзержинского 18-3").
                recipientAddress("г. Омск, ул. Пригородная 19").shipmentType(ShipmentType.REGISTERED_MAIL)
            .build()


    print("Посылка из ${worldWideShipment.senderCountry}, ${worldWideShipment.senderAddress}" +
            " в ${worldWideShipment.recipientCountry}, ${worldWideShipment.recipientAddress}\n")

    print("Посылка из ${internalShipment.senderAddress}" + " в ${internalShipment.recipientAddress}\n")

}