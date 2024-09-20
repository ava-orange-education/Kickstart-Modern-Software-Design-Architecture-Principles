import os
import sys
import logging

MAX_RETRIES = 3
DEFAULT_TIMEOUT = 10

def process_data(data):
    try:
        result = perform_complex_operation(data)
        return result
    except Exception as e:
        logging.error(f"Error processing your data: {e}")
        return None

class DataProcessor:
  
    def __init__(self, name):
        self.name = name
        
    def process(self, data):
        try:
            result = perform_complex_operation(data)
            return result
        except Exception as e:
            logging.error(f"Error processing your data: {e}")
            return None

def perform_complex_operation(data):
    for _ in range(MAX_RETRIES):
        try:
            result = data * 2
            return result
        except Exception as e:
            logging.warning(f"Retrying the operation: {e}")
    return None

if __name__ == "__main__":
    data = "example"
    processor = DataProcessor("example_processor")
    processed_data = processor.process(data)
    print(processed_data)
