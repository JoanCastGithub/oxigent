package com.oxigent.challenge.products.mapper;

import com.oxigent.challenge.products.domain.GroupCompanyEntity;
import com.oxigent.challenge.products.domain.TarifEntity;
import com.oxigent.challenge.products.dto.GroupCompanyDto;
import com.oxigent.challenge.products.dto.TarifDto;
import com.oxigent.challenge.products.dto.TarifDtoResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.annotation.processing.Generated;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-01T19:17:22+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class TarifMapperImpl implements TarifMapper {

    private final DatatypeFactory datatypeFactory;

    public TarifMapperImpl() {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        }
        catch ( DatatypeConfigurationException ex ) {
            throw new RuntimeException( ex );
        }
    }

    @Override
    public TarifDto mapToTarifDomain(TarifEntity tarif) {
        if ( tarif == null ) {
            return null;
        }

        TarifDto.TarifDtoBuilder tarifDto = TarifDto.builder();

        tarifDto.tarifId( tarif.getTarifId() );
        tarifDto.startDate( tarif.getStartDate() );
        tarifDto.endDate( tarif.getEndDate() );
        tarifDto.priority( (byte) tarif.getPriority() );
        tarifDto.product( tarif.getProduct() );
        tarifDto.price( tarif.getPrice() );
        tarifDto.curr( tarif.getCurr() );
        tarifDto.brandId( groupCompanyEntityToGroupCompanyDto( tarif.getBrandId() ) );

        return tarifDto.build();
    }

    @Override
    public TarifEntity mapToTarifEntity(TarifDto tarifDto) {
        if ( tarifDto == null ) {
            return null;
        }

        TarifEntity.TarifEntityBuilder tarifEntity = TarifEntity.builder();

        tarifEntity.tarifId( tarifDto.getTarifId() );
        tarifEntity.startDate( tarifDto.getStartDate() );
        tarifEntity.endDate( tarifDto.getEndDate() );
        tarifEntity.priority( tarifDto.getPriority() );
        tarifEntity.product( tarifDto.getProduct() );
        tarifEntity.price( tarifDto.getPrice() );
        tarifEntity.curr( tarifDto.getCurr() );
        tarifEntity.brandId( groupCompanyDtoToGroupCompanyEntity( tarifDto.getBrandId() ) );

        return tarifEntity.build();
    }

    @Override
    public TarifDtoResponse mapToTarifResponse(TarifDto tarifDto) {
        if ( tarifDto == null ) {
            return null;
        }

        TarifDtoResponse.TarifDtoResponseBuilder tarifDtoResponse = TarifDtoResponse.builder();

        Long brandId = tarifDtoBrandIdBrandId( tarifDto );
        if ( brandId != null ) {
            tarifDtoResponse.brandId( String.valueOf( brandId ) );
        }
        tarifDtoResponse.tarifId( tarifDto.getTarifId() );
        tarifDtoResponse.startDate( xmlGregorianCalendarToString( dateToXmlGregorianCalendar( tarifDto.getStartDate() ), null ) );
        tarifDtoResponse.endDate( xmlGregorianCalendarToString( dateToXmlGregorianCalendar( tarifDto.getEndDate() ), null ) );
        tarifDtoResponse.priority( tarifDto.getPriority() );
        tarifDtoResponse.product( tarifDto.getProduct() );
        tarifDtoResponse.price( tarifDto.getPrice() );
        tarifDtoResponse.curr( tarifDto.getCurr() );

        return tarifDtoResponse.build();
    }

    private String xmlGregorianCalendarToString( XMLGregorianCalendar xcal, String dateFormat ) {
        if ( xcal == null ) {
            return null;
        }

        if (dateFormat == null ) {
            return xcal.toString();
        }
        else {
            Date d = xcal.toGregorianCalendar().getTime();
            SimpleDateFormat sdf = new SimpleDateFormat( dateFormat );
            return sdf.format( d );
        }
    }

    private XMLGregorianCalendar dateToXmlGregorianCalendar( Date date ) {
        if ( date == null ) {
            return null;
        }

        GregorianCalendar c = new GregorianCalendar();
        c.setTime( date );
        return datatypeFactory.newXMLGregorianCalendar( c );
    }

    protected GroupCompanyDto groupCompanyEntityToGroupCompanyDto(GroupCompanyEntity groupCompanyEntity) {
        if ( groupCompanyEntity == null ) {
            return null;
        }

        GroupCompanyDto.GroupCompanyDtoBuilder groupCompanyDto = GroupCompanyDto.builder();

        groupCompanyDto.brandId( groupCompanyEntity.getBrandId() );
        groupCompanyDto.brand( groupCompanyEntity.getBrand() );

        return groupCompanyDto.build();
    }

    protected GroupCompanyEntity groupCompanyDtoToGroupCompanyEntity(GroupCompanyDto groupCompanyDto) {
        if ( groupCompanyDto == null ) {
            return null;
        }

        GroupCompanyEntity.GroupCompanyEntityBuilder groupCompanyEntity = GroupCompanyEntity.builder();

        groupCompanyEntity.brandId( groupCompanyDto.getBrandId() );
        groupCompanyEntity.brand( groupCompanyDto.getBrand() );

        return groupCompanyEntity.build();
    }

    private Long tarifDtoBrandIdBrandId(TarifDto tarifDto) {
        if ( tarifDto == null ) {
            return null;
        }
        GroupCompanyDto brandId = tarifDto.getBrandId();
        if ( brandId == null ) {
            return null;
        }
        long brandId1 = brandId.getBrandId();
        return brandId1;
    }
}
