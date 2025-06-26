def calculate_sum(a, b):
    """Calculate the sum of two numbers."""
    result = a + b
    print(f"Calculating {a} + {b} = {result}")
    return result

def calculate_product(a, b):
    """Calculate the product of two numbers."""
    return a * b

def calculate_difference(a, b):
    """Calculate the difference of two numbers."""
    return a - b

def main():
    x = 10
    y = 20
    z = 5
    
    sum_result = calculate_sum(x, y)
    product_result = calculate_product(x, y)
    
    print(f"Sum: {sum_result}")
    print(f"Product: {product_result}")

if __name__ == "__main__":
    main()