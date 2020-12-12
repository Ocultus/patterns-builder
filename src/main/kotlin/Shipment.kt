class Shipment private constructor(val shipmentType: ShipmentType?, val senderCountry: String?,
                                 val recipientCountry: String?, val senderAddress: String?,
                                 val recipientAddress: String?, val weight: Int?){

    data class Builder(var shipmentType: ShipmentType? = null, var senderCountry: String? = null,
                       var recipientCountry: String? = null, var senderAddress: String? = null,
                       var recipientAddress: String? = null, var weight: Int? = null){
        fun shipmentType(shipmentType: ShipmentType) = apply {this.shipmentType = shipmentType}
        fun senderCountry(senderCountry: String?) = apply {this.senderCountry = senderCountry }
        fun recipientCountry(recipientCountry: String?) = apply {this.recipientCountry = recipientCountry}
        fun senderAddress(senderAddress: String?) = apply { this.senderAddress = senderAddress }
        fun recipientAddress(recipientAddress: String?) = apply { this.recipientAddress = recipientAddress }
        fun weight(weight: Int?) = apply { this.weight = weight }
        fun build() = Shipment(shipmentType, senderCountry, recipientCountry, senderAddress,
                recipientAddress, weight)
    }

}