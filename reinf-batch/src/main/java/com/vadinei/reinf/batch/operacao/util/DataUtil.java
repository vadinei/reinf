package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public final class DataUtil implements Serializable {

	private static final long serialVersionUID = 6635503413007868594L;

	public static synchronized String formatar(final Date data, final String formato) {
		return new SimpleDateFormat(formato).format(data);
	}

	public static synchronized Date formatar(final String data, final String formato) {
		final SimpleDateFormat format = new SimpleDateFormat(formato);
		Date dataRetorno = null;

		try {
			dataRetorno = format.parse(data);
		} catch (final ParseException e) {
			return null;
		}
		return dataRetorno;
	}

	public static synchronized Date recuperarPrimeiroDiaDoAno(final Date date) {
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.MONTH, calendar.getActualMinimum(Calendar.MONTH));
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMinimum(Calendar.HOUR_OF_DAY));
		calendar.set(Calendar.MINUTE, calendar.getActualMinimum(Calendar.MINUTE));
		calendar.set(Calendar.SECOND, calendar.getActualMinimum(Calendar.SECOND));
		calendar.set(Calendar.MILLISECOND, calendar.getActualMinimum(Calendar.MILLISECOND));
		return calendar.getTime();
	}

	public static synchronized Date recuperarUltimoDia(final Date date) {
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMaximum(Calendar.HOUR_OF_DAY));
		calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
		calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
		calendar.set(Calendar.MILLISECOND, calendar.getActualMaximum(Calendar.MILLISECOND));
		return calendar.getTime();
	}

	public static synchronized Date recuperarPrimeiroDia(final Date date) {
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMinimum(Calendar.HOUR_OF_DAY));
		calendar.set(Calendar.MINUTE, calendar.getActualMinimum(Calendar.MINUTE));
		calendar.set(Calendar.SECOND, calendar.getActualMinimum(Calendar.SECOND));
		calendar.set(Calendar.MILLISECOND, calendar.getActualMinimum(Calendar.MILLISECOND));
		return calendar.getTime();
	}

	public static synchronized XMLGregorianCalendar converterDateParaXML(final Date data) {
		try {
			final GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(data);
			return DatatypeFactory.newInstance().newXMLGregorianCalendarDate(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH),
					DatatypeConstants.FIELD_UNDEFINED);
		} catch (final DatatypeConfigurationException e) {
			return null;
		}
	}

	public static synchronized XMLGregorianCalendar converterDateParaXML(final Date data, final String format) {
		try {
			final DateFormat dateFormat = new SimpleDateFormat(format);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(dateFormat.format(data));
		} catch (final DatatypeConfigurationException e) {
			return null;
		}
	}

}
