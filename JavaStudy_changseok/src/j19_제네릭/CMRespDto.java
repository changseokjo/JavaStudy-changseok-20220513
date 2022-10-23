package j19_제네릭;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data;
}
