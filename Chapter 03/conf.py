# conf.py

import os
import sys

sys.path.insert(0, os.path.abspath('.'))
extensions = ['sphinx.ext.autodoc', 'rst2pdf.pdfbuilder']
pdf_documents = [('index', u'documentation', u'Sample Python Documentation', u'Your Name'),]

