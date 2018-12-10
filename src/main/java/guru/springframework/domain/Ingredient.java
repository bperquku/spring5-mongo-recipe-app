package guru.springframework.domain;

import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude= {"recipe"})
public class Ingredient {

	private String id;

	private String description;
	private BigDecimal amount;

	private Recipe recipe;

	private UnitOfMeasure unitOfMeasure;
	
	public Ingredient() {}
	
	public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasure = uom;
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
		this.description = description;
		this.amount = amount;
		this.unitOfMeasure = uom;
		this.recipe = recipe;
	}
}
