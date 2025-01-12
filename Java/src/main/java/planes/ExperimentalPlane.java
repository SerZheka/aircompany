package planes;

import models.ClassificationLevel;

public class ExperimentalPlane extends Plane {

    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model,
                             int maxSpeed,
                             int maxFlightDistance,
                             int maxLoadCapacity,
                             ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
