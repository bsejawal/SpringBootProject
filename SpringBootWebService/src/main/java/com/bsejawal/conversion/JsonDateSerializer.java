package com.bsejawal.conversion;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonDateSerializer extends JsonSerializer<Date> {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

	@Override
	public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		String stringFormat = dateFormat.format(date);
		jsonGenerator.writeString(stringFormat);
	}

}
