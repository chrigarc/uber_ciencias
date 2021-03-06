define({ "api": [
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "./target/proyecto-1.0.0/doc/main.js",
    "group": "C__Users_chrigarc_Documents_Lexa_Bases_uber_ciencias_target_proyecto_1_0_0_doc_main_js",
    "groupTitle": "C__Users_chrigarc_Documents_Lexa_Bases_uber_ciencias_target_proyecto_1_0_0_doc_main_js",
    "name": ""
  },
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "./webapp/doc/main.js",
    "group": "C__Users_chrigarc_Documents_Lexa_Bases_uber_ciencias_webapp_doc_main_js",
    "groupTitle": "C__Users_chrigarc_Documents_Lexa_Bases_uber_ciencias_webapp_doc_main_js",
    "name": ""
  },
  {
    "type": "get",
    "url": "persona/?id=:id",
    "title": "",
    "name": "Get_Persona",
    "group": "Persona",
    "version": "0.0.1",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": ""
          }
        ]
      }
    },
    "success": {
      "fields": {
        "200": [
          {
            "group": "200",
            "type": "json",
            "optional": false,
            "field": "persona",
            "description": "<p>informacion de la persona</p>"
          }
        ]
      }
    },
    "filename": "./endpoint.js",
    "groupTitle": "Persona",
    "sampleRequest": [
      {
        "url": "http://localhost:8080/proyecto/app/clase/persona/?id=:id"
      }
    ]
  },
  {
    "type": "get",
    "url": "personas/",
    "title": "",
    "name": "Get_Personas",
    "group": "Persona",
    "version": "0.0.1",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "json",
            "optional": false,
            "field": "Lista",
            "description": "<p>de personas0</p>"
          }
        ]
      }
    },
    "filename": "./endpoint.js",
    "groupTitle": "Persona",
    "sampleRequest": [
      {
        "url": "http://localhost:8080/proyecto/app/clase/personas/"
      }
    ]
  },
  {
    "type": "post",
    "url": "persona",
    "title": "",
    "name": "Registrar_Persona",
    "group": "Persona",
    "version": "0.0.1",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "nombre",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "paterno",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "materno",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "Int",
            "optional": false,
            "field": "id_direccion",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "email",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "telefono_casa",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "telefono_celular",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "rfc",
            "description": ""
          }
        ]
      }
    },
    "success": {
      "fields": {
        "200": [
          {
            "group": "200",
            "type": "json",
            "optional": false,
            "field": "persona",
            "description": "<p>informacion de la nueva persona</p>"
          }
        ]
      }
    },
    "filename": "./endpoint.js",
    "groupTitle": "Persona",
    "sampleRequest": [
      {
        "url": "http://localhost:8080/proyecto/app/clase/persona"
      }
    ]
  }
] });
