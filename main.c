#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

/* Exp
 *   since this is an abstract class with no constructor,
 *   we don't need to implement a new method for it. */
typedef struct ExpTable ExpTable_t;
typedef struct Exp Exp_t;
struct Exp {
  ExpTable_t * table;
};

struct ExpTable {
  bool (*eval)(Exp_t * exp);
};

bool exp_eval(Exp_t * e) {
  return e->table->eval(e);
}

/* Lit
 *   the virtual table for Lit is omitted,
 *   since it don't have any other methods. */
typedef struct Lit {
  ExpTable_t * table;
  bool val;
} Lit_t;

bool lit_eval(Exp_t * e) {
  return ((Lit_t *) e)->val;
}

Exp_t * lit_new(bool val) {
  ExpTable_t * table = (ExpTable_t *) malloc(sizeof(ExpTable_t));
  table->eval = lit_eval;

  Lit_t * obj = (Lit_t*) malloc(sizeof(Lit_t));
  obj->table = table;
  obj->val = val;

  return (Exp_t*) obj;
}

/* And */
typedef struct And {
  ExpTable_t * table;
  bool val;
// COMPLETE HERE...
} And_t;

// IMPLEMENT THESE FUNCTIONS
bool and_eval(Exp_t * e){
  return ((And_t *) e)->val;
};
Exp_t * and_new(Exp_t *e1, Exp_t * e2){
  ExpTable_t * table = (ExpTable_t *) malloc(sizeof(ExpTable_t));
  table->eval = and_eval;

  And_t * obj = (And_t*) malloc(sizeof(And_t));
  obj->table = table;
  obj->val = exp_eval(e1)&&exp_eval(e2);

  return (Exp_t*) obj;
}
int main()
{
    printf("exp_eval(lit_new(true))");
    if(exp_eval(lit_new(true)))
        printf("  true\n");
    else
        printf("  false\n");

    printf("exp_eval(lit_new(false))");
    if(exp_eval(lit_new(false)))
        printf("  true\n");
    else
        printf("  false\n");

    printf("exp_eval(and_new(lit_new(true), lit_new(true)))");
    if(exp_eval(and_new(lit_new(true), lit_new(true))))
        printf("  true\n");
    else
        printf("  false\n");

    printf("exp_eval(and_new(lit_new(true), lit_new(false)))");
    if(exp_eval(and_new(lit_new(true), lit_new(false))))
        printf("  true\n");
    else
        printf("  false\n");
    return 0;
}
