package br.com.tasty.api.v1.restaurant.mapper;

import br.com.tasty.api.v1.restaurant.model.AddressRequest;
import br.com.tasty.api.v1.restaurant.model.response.AddressResponse;
import br.com.tasty.common.model.AddressModelImpl;
import br.com.tasty.common.model.response.ViaCepResponse;

public class AddressMapper {
    public static AddressModelImpl mapToAddressModelImpl(AddressRequest addressRequest, ViaCepResponse viaCepResponse) {
        return AddressModelImpl.builder()
                .street(viaCepResponse.getLogradouro())
                .number(addressRequest.getNumber())
                .neighborhood(viaCepResponse.getBairro())
                .city(viaCepResponse.getLocalidade())
                .state(viaCepResponse.getUf())
                .zipCode(viaCepResponse.getCep())
                .complement(addressRequest.getComplement())
                .build();
    }

    public static AddressResponse mapToAddressResponse(AddressModelImpl addressModelImpl) {
        return AddressResponse.builder()
                .street(addressModelImpl.getStreet())
                .number(addressModelImpl.getNumber())
                .neighborhood(addressModelImpl.getNeighborhood())
                .city(addressModelImpl.getCity())
                .state(addressModelImpl.getState())
                .zipCode(addressModelImpl.getZipCode())
                .build();
    }
}
